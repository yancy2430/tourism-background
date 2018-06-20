$(function(){
    var $sliderTrack = $('#sliderTrack'),
        $sliderHandler = $('#sliderHandler'),
        $sliderValue = $('#sliderValue');

    var totalLen = $('#sliderInner').width(),
        startLeft = 0,
        startX = 0;

    $sliderHandler.on('touchstart', function (e) {
            startLeft = parseInt($sliderHandler.css('left')) * totalLen / 100;
            console.log(e.changedTouches)
            startX = e.changedTouches[0].clientX;
        }).on('touchmove', function(e){
            var dist = startLeft + e.changedTouches[0].clientX - startX,
                percent;
            dist = dist < 0 ? 0 : dist > totalLen ? totalLen : dist;
            percent =  parseInt(dist / totalLen * 100);
            $sliderTrack.css('width', percent + '%');
            $sliderHandler.css('left', percent + '%');
            $sliderValue.text(percent);

            e.preventDefault();
        })
    ;
});