package com.example.crazynet.student_library;

import com.example.crazynet.student_library.webService.models.orderQuantity;
import com.example.crazynet.student_library.webService.models.orders;
import com.example.crazynet.student_library.webService.requests.Product_mostViewrequest;
import com.example.crazynet.student_library.webService.requests.aboutUsrequest;
import com.example.crazynet.student_library.webService.requests.accountsrequest;
import com.example.crazynet.student_library.webService.requests.addBillesrequest;
import com.example.crazynet.student_library.webService.requests.addOrderrequest;
import com.example.crazynet.student_library.webService.requests.adsrequest;
import com.example.crazynet.student_library.webService.requests.brandRequest;
import com.example.crazynet.student_library.webService.requests.changePasswordrequest;
import com.example.crazynet.student_library.webService.requests.citiesrequest;
import com.example.crazynet.student_library.webService.requests.colorRequest;
import com.example.crazynet.student_library.webService.requests.deleteOrderrequest;
import com.example.crazynet.student_library.webService.requests.forgetPasswordrequest;
import com.example.crazynet.student_library.webService.requests.getBillesrequest;
import com.example.crazynet.student_library.webService.requests.getOrderrequest;
import com.example.crazynet.student_library.webService.requests.loginrequest;
import com.example.crazynet.student_library.webService.requests.notificationRegistrationrequest;
import com.example.crazynet.student_library.webService.requests.policyTermsrequest;
import com.example.crazynet.student_library.webService.requests.productInforequest;
import com.example.crazynet.student_library.webService.requests.productsrequest;
import com.example.crazynet.student_library.webService.requests.resendCoderequest;
import com.example.crazynet.student_library.webService.requests.searchrequest;
import com.example.crazynet.student_library.webService.requests.updateOrderRequest;
import com.example.crazynet.student_library.webService.requests.updatePasswordrequest;
import com.example.crazynet.student_library.webService.requests.validateCoderequest;
import com.example.crazynet.student_library.webService.requests.visitorrequest;
import com.example.crazynet.student_library.webService.response.Product_mostViewresponse;
import com.example.crazynet.student_library.webService.response.aboutUsresponse;
import com.example.crazynet.student_library.webService.response.accountsresponse;
import com.example.crazynet.student_library.webService.response.addBillesresponse;
import com.example.crazynet.student_library.webService.response.addOrderresponse;
import com.example.crazynet.student_library.webService.response.adsresponse;
import com.example.crazynet.student_library.webService.response.brandResponse;
import com.example.crazynet.student_library.webService.response.changePasswordresponse;
import com.example.crazynet.student_library.webService.response.citiesresponse;
import com.example.crazynet.student_library.webService.response.colorResponse;
import com.example.crazynet.student_library.webService.response.deleteOrderresponse;
import com.example.crazynet.student_library.webService.response.forgetPasswordresponse;
import com.example.crazynet.student_library.webService.response.getBillesresponse;
import com.example.crazynet.student_library.webService.response.getOrderresponse;
import com.example.crazynet.student_library.webService.response.loginrsponse;
import com.example.crazynet.student_library.webService.response.notificationRegistrationresponse;
import com.example.crazynet.student_library.webService.response.policyTermsresponse;
import com.example.crazynet.student_library.webService.response.productInforesponse;
import com.example.crazynet.student_library.webService.response.productsresponse;
import com.example.crazynet.student_library.webService.response.registerresponse;
import com.example.crazynet.student_library.webService.response.resendCoderesponse;
import com.example.crazynet.student_library.webService.response.searchresponse;
import com.example.crazynet.student_library.webService.response.updateOrderResponse;
import com.example.crazynet.student_library.webService.response.updatePasswordresponse;
import com.example.crazynet.student_library.webService.response.updateProfileresponse;
import com.example.crazynet.student_library.webService.response.validateCoderesponse;
import com.example.crazynet.student_library.webService.response.visitorResponse;

import java.util.ArrayList;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public interface RetrofitService {

    @POST("policyTerms")
    Call<policyTermsresponse> getTerms (@Body policyTermsrequest policyTermsRequest);

    @POST("account")
    Call<accountsresponse>  getaccounts (@Body accountsrequest accountsrequest);

    @POST("cities")
    Call<citiesresponse> getcities (@Body citiesrequest citiesrequest);


    @POST("validateCode")
    Call<validateCoderesponse> getvalidateCode (@Body validateCoderequest validateCoderequest);

    @POST("resendCode")
    Call<resendCoderesponse> getresendCode (@Body resendCoderequest resendCoderequest);

    @POST("forgetPassword")
    Call<forgetPasswordresponse> getforgetPassword (@Body forgetPasswordrequest forgetPasswordrequest);

    @POST("changePassword")
    Call<changePasswordresponse> getchangePassword (@Body changePasswordrequest changePasswordrequest);

    @POST("login")
    Call<loginrsponse> getlogin (@Body loginrequest loginrequest);


    // insted of sending the request as a block we divide it into multi parts to make me able to divide the photo into multi parts
    // photos can't be send as it is , it must  be divided into multi parts
    @Multipart
    @POST("register")
    Call<registerresponse> getregister (
            @Part ("name") RequestBody name,
            @Part ("email") RequestBody email,
            @Part ("area_id") RequestBody area_id,
            @Part ("city_id") RequestBody city_id,
            @Part ("phone") RequestBody phone,
            @Part ("password") RequestBody password,
            @Part  MultipartBody.Part photoUrl );


    @Multipart
    @POST("updateProfile")
    Call<updateProfileresponse> getupdateProfile (@Part ("apiToken")RequestBody apiToken,
                                                  @Part ("name")RequestBody name,
                                                  @Part ("email")RequestBody email ,
                                                  @Part("phone")RequestBody phone ,
                                                  @Part ("cityId")RequestBody cityId ,
                                                  @Part ("areaId") RequestBody areaId ,
                                                  @Part ("district") RequestBody district ,
                                                  @Part ("home") RequestBody home ,
                                                  @Part ("street") RequestBody street,
                                                  @Part  MultipartBody.Part photo);

    @POST("updatePassword")
    Call<updatePasswordresponse> getupdatePassword (@Body updatePasswordrequest updatePasswordrequest);

    @POST("product")
    Call<productsresponse> getproducts (@Body productsrequest productsrequest);

    @POST("search")
    Call<searchresponse> getsearch (@Body searchrequest searchrequest);

    @POST("ads")
    Call<adsresponse> getads (@Body adsrequest adsrequest);

    @POST("productInfo")
    Call<productInforesponse> getproductInfo (@Body productInforequest productInforequest);

    @POST("addOrder")
    Call<addOrderresponse> getaddOrder (@Body addOrderrequest addOrderrequest);

    @POST("getOrder")
    Call<getOrderresponse> getgetOrder(@Body getOrderrequest getOrderrequest);

    @POST("deleteOrder")
    Call<deleteOrderresponse> getdeleteOrder (@Body deleteOrderrequest deleteOrderrequest);


    @POST("addBilles")
    Call<addBillesresponse> getaddBilles (
           @Body addBillesrequest addBillesrequest
            );


    @POST("getBilles")
    Call<getBillesresponse> getgetBilles (@Body getBillesrequest getBillesrequest);

    @POST("notificationRegistration")
    Call<notificationRegistrationresponse> getnotificationRegistration (@Body notificationRegistrationrequest notificationRegistrationrequest);

    @POST("aboutUs")
    Call<aboutUsresponse> getaboutUs (@Body aboutUsrequest aboutUsrequest);

    @POST("Product/mostView")
    Call<Product_mostViewresponse> getProduct_mostView (@Body Product_mostViewrequest productMostViewrequest);

    @POST("color")
    Call<colorResponse> getColor (@Body colorRequest colorRequest);

    @POST("brand")
    Call<brandResponse> getbrand (@Body brandRequest brandRequest);

    @FormUrlEncoded
    @POST("updateOrder")
    Call<updateOrderResponse> getupdateOrder (
            @Field("OrderQuantity") ArrayList<orderQuantity> orderQuantities,
            @Field("apiToken") String apiToken
    );

    @POST("visitor")
    Call<visitorResponse> getVisitor(@Body visitorrequest visitorrequest);
}
