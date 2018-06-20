package com.tdeado.tourism.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tdeado.tourism.entity.Review;
/**
*  @author 
*/
public interface ReviewBaseMapper {

    int insertReview(Review object);

    int updateReview(Review object);

    List<Review> queryReview(Review object);

    Review queryReviewLimit1(Review object);

}