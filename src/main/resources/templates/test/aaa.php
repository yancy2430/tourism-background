<?php
ini_set('display_errors', 1);            //错误信息
ini_set('display_startup_errors', 1);    //php启动错误信息
error_reporting(-1);                    //打印出所有的 错误信息

/**
 * Created by PhpStorm.
 * User: zhe
 * Date: 2018/5/20
 * Time: 上午1:52
 */
include('PHPExcel.php');
$obj = new PHPExcel();

//魔术变量，获取当前文件的绝对路径

$filename = __DIR__ . '/vehicle_maintenace.xlsx';

$data = importExecl($filename);

//echo json_encode($data);die;
$list = array();
$i = 0;
foreach ($data as $value) {
//        $list[$i] = $value;
    $item['orgnName'] = $value['A'];
    $item['plateNo'] = $value['B'];
    $item['contactPerson'] = $value['C'];
    $item['contactNumber'] = $value['D'];
    $item['maintenanceTime'] = $value['E'];
    $item['kilometers'] = $value['F'];
    $item['maintenanceName'] = $value['G'];
    $item['maintenanceDesc'] = $value['H'];
    $item['remark'] = $value['I'];
    $item['materialCostInfo'] = json_encode(array(
        "materialName" => $value['J'],
        "materialType" => $value['K'],
        "supplier" => $value['L'],
        "tel" => $value['M'],
        "num" => $value['N'],
        "unit" => $value['O'],
        "price" => $value['P'],
        "total" => $value['Q'],
    ));
    $item["materialCostTotal"] = $value['R'];
    $item["workingHours"] = json_encode(array(
        "workingName" => $value['S'],
        "price" => $value['T'],
        "quota" => $value['U'],
        "hoursCosts" => $value['V'],
    ));
    $item["workingHoursTotal"] = $value['W'];
    $item["maintenanceTotal"] = $value['X'];
    $item["approveOrgn"] = $value['Y'];
    $item["approvePerson"] = $value['Z'];
    $item["approveDate"] = $value['AA'];
    $item["approveStatus"] = $value['AB'];
    $item["approveDesc"] = $value['AC'];
    $list[$i] = $item;
    $i++;
}
echo json_encode($list);

/**
 *  数据导入
 * @param string $file excel文件
 * @param string $sheet
 * @return string   返回解析数据
 * @throws PHPExcel_Exception
 * @throws PHPExcel_Reader_Exception
 */
function importExecl($file = '', $sheet = 0)
{
    $file = iconv("utf-8", "gb2312", $file);   //转码
    if (empty($file) OR !file_exists($file)) {
        die('file not exists!');
    }
    $objRead = new PHPExcel_Reader_Excel2007();   //建立reader对象
    if (!$objRead->canRead($file)) {
        $objRead = new PHPExcel_Reader_Excel5();
        if (!$objRead->canRead($file)) {
            die('No Excel!');
        }
    }

    $cellName = array('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'AA', 'AB', 'AC', 'AD', 'AE', 'AF', 'AG', 'AH', 'AI', 'AJ', 'AK', 'AL', 'AM', 'AN', 'AO', 'AP', 'AQ', 'AR', 'AS', 'AT', 'AU', 'AV', 'AW', 'AX', 'AY', 'AZ');

    $obj = $objRead->load($file);  //建立excel对象
    $currSheet = $obj->getSheet($sheet);   //获取指定的sheet表
    $columnH = $currSheet->getHighestColumn();   //取得最大的列号
    $columnCnt = array_search($columnH, $cellName);
    $rowCnt = $currSheet->getHighestRow();   //获取总行数

    $data = array();
    for ($_row = 4; $_row <= $rowCnt; $_row++) {  //读取内容
        for ($_column = 0; $_column <= $columnCnt; $_column++) {
            $cellId = $cellName[$_column] . $_row;
            $cellValue = $currSheet->getCell($cellId)->getValue();
            //$cellValue = $currSheet->getCell($cellId)->getCalculatedValue();  #获取公式计算的值
            if ($cellValue instanceof PHPExcel_RichText) {   //富文本转换字符串
                $cellValue = $cellValue->__toString();
            }
            if ($cellName[$_column] == 'Z' || $cellName[$_column] == 'E') {
                $cellValue = gmdate('Y-m-d', ($cellValue - 25569) * 24 * 60 * 60);
            }
            $data[$_row][$cellName[$_column]] = $cellValue;
        }
    }

    return $data;
}