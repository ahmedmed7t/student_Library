package com.example.crazynet.student_library.webService;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import com.example.crazynet.student_library.Main2Activity;
import com.example.crazynet.student_library.MainActivity;
import com.example.crazynet.student_library.R;
import com.example.crazynet.student_library.RetrofitWebService;
import com.example.crazynet.student_library.webService.models.brand;
import com.example.crazynet.student_library.webService.models.color;
import com.example.crazynet.student_library.webService.models.orderQuantity;
import com.example.crazynet.student_library.webService.models.orders;
import com.example.crazynet.student_library.webService.models.photo;
import com.example.crazynet.student_library.webService.models.product;
import com.example.crazynet.student_library.webService.models.type;
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
import com.example.crazynet.student_library.webService.requests.registerrequest;
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

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Medhat on 16/08/2018.
 */

public class validatestatus extends MainActivity {



    public void aboutUsStatus(){

       RetrofitWebService.getService().getaboutUs(new aboutUsrequest()).enqueue(new Callback<aboutUsresponse>() {
           @Override
           public void onResponse(Call<aboutUsresponse> call, Response<aboutUsresponse> response) {
               int status = response.body().getStatus();
               switch (status)
               {
                   case 200:
                       //success
                       break;
                   case 400:
                       Toast.makeText(getApplicationContext(),
                               "please fill the required data", Toast.LENGTH_LONG).show();
                       break;
                   case 402:
                       // the account is deactivated by admin
                       break;
                   case 404:
                       // unknown
                       break;
                   case 405:
                       Toast.makeText(getApplicationContext(),
                               "there is no data", Toast.LENGTH_LONG).show();
                       break;
                   case 204:
                       Toast.makeText(getApplicationContext(),
                               "please enter a valid data", Toast.LENGTH_LONG).show();
                       break;

               }
           }

           @Override
           public void onFailure(Call<aboutUsresponse> call, Throwable t) {

           }
       });

    }
    public void policyTermsStatus() {
        RetrofitWebService.getService().getTerms(new policyTermsrequest()).enqueue(new Callback<policyTermsresponse>() {
            @Override
            public void onResponse(Call<policyTermsresponse> call, Response<policyTermsresponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;


                }
            }

            @Override
            public void onFailure(Call<policyTermsresponse> call, Throwable t) {

            }
        });
    }
    public void accountsStatus() {
        RetrofitWebService.getService().getaccounts(new accountsrequest()).enqueue(new Callback<accountsresponse>() {
            @Override
            public void onResponse(Call<accountsresponse> call, Response<accountsresponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;


                }
            }

            @Override
            public void onFailure(Call<accountsresponse> call, Throwable t) {

            }
        });
    }
    public void citiesStatus(){
        RetrofitWebService.getService().getcities(new citiesrequest()).enqueue(new Callback<citiesresponse>() {
            @Override
            public void onResponse(Call<citiesresponse> call, Response<citiesresponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;


                }
            }

            @Override
            public void onFailure(Call<citiesresponse> call, Throwable t) {

            }
        });
    }
    public void registerStatus(Bitmap bitmap){


        // transfer image file to string
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG , 100 , baos);
        byte[] b = baos.toByteArray();
        String img = Base64.encodeToString(b, Base64.DEFAULT);


        RequestBody name = RequestBody.create(MediaType.parse("text/plain"), "ahmedmedhat");
        RequestBody email = RequestBody.create(MediaType.parse("text/plain"), "ahmed123@gmail.com");
        RequestBody phone = RequestBody.create(MediaType.parse("text/plain"), "01011223344");
        RequestBody city_id = RequestBody.create(MediaType.parse("text/plain"), "1");
        RequestBody area_id = RequestBody.create(MediaType.parse("text/plain"), "1");
        RequestBody password = RequestBody.create(MediaType.parse("text/plain"), "123456789");

        // prepare the image as a multiPart
        RequestBody photo = RequestBody.create(MediaType.parse("text/plain"), img);
        MultipartBody.Part imagenPerfil = MultipartBody.Part.createFormData("photoUrl", img, photo);


        RetrofitWebService.getService().getregister(name,email,area_id,city_id,phone,password,imagenPerfil).enqueue(new Callback<registerresponse>() {
            @Override
            public void onResponse(Call<registerresponse> call, Response<registerresponse> response) {
                int status = response.body().getStatus();
                Intent i;
                switch (status)
                {
                    case 200:
                        //success

                        Log.v("the status is : "," status = 200");
                       //  Toast.makeText(getApplicationContext(),
                         //        "success", Toast.LENGTH_LONG).show();

                        break;
                    case 400:
                        Log.v("the status is : "," status = 400");
                        // Toast.makeText(getApplicationContext(),
                          //       "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        Log.v("the status is : "," status = 402");
                        // the account is deactivated by admin
                      //   Toast.makeText(getApplicationContext(),
                        //         "402", Toast.LENGTH_LONG).show();
                        break;
                    case 404:
                        // unknown
                         Toast.makeText(getApplicationContext(), "404", Toast.LENGTH_LONG).show();
                    //    Log.v("the status is : "," status = 404");
                        break;
                    case 405:
                        Log.v("the status is : "," status = 405");
                     //   Toast.makeText(getApplicationContext(), "405", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Log.v("the status is : "," status = 204");
                       // Toast.makeText(getApplicationContext(), "204", Toast.LENGTH_LONG).show();
                        break;

                    case 550:
                        Log.v("the status is : "," status = 550");
                       // Toast.makeText(getApplicationContext(),"this email is already exist",Toast.LENGTH_LONG).show();
                        break;

                }
            }

            @Override
            public void onFailure(Call<registerresponse> call, Throwable t) {
                Log.v("the status is : "," status = fail");
            }
        });
    }
    public void validateCodeStatus(){
        RetrofitWebService.getService().getvalidateCode(new validateCoderequest("medhat@gmail.com","123456")).enqueue(new Callback<validateCoderesponse>() {
            @Override
            public void onResponse(Call<validateCoderesponse> call, Response<validateCoderesponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;
                    case 408:
                        Toast.makeText(getApplicationContext(),"incorrect code",Toast.LENGTH_LONG).show();
                        break;

                }
            }

            @Override
            public void onFailure(Call<validateCoderesponse> call, Throwable t) {

            }
        });
    }
    public void resendCodeStatus(){
        RetrofitWebService.getService().getresendCode(new resendCoderequest("medhat@gmail.com")).enqueue(new Callback<resendCoderesponse>() {
            @Override
            public void onResponse(Call<resendCoderesponse> call, Response<resendCoderesponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;


                }
            }

            @Override
            public void onFailure(Call<resendCoderesponse> call, Throwable t) {

            }
        });
    }
    public void forgetPasswordStatus(){
        RetrofitWebService.getService().getforgetPassword(new forgetPasswordrequest("medhat@gmail.com")).enqueue(new Callback<forgetPasswordresponse>() {
            @Override
            public void onResponse(Call<forgetPasswordresponse> call, Response<forgetPasswordresponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;
                    case 409:
                        Toast.makeText(getApplicationContext(),"this email is not exist",Toast.LENGTH_LONG).show();
                        break;

                }
            }

            @Override
            public void onFailure(Call<forgetPasswordresponse> call, Throwable t) {

            }
        });
    }
    public void changePasswordStatus(){
        RetrofitWebService.getService().getchangePassword(new changePasswordrequest("1fff","newpasspass")).enqueue(new Callback<changePasswordresponse>() {
            @Override
            public void onResponse(Call<changePasswordresponse> call, Response<changePasswordresponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;


                }
            }

            @Override
            public void onFailure(Call<changePasswordresponse> call, Throwable t) {

            }
        });
    }
    public void loginStatus(){
        RetrofitWebService.getService().getlogin(new loginrequest("medhat@gmail.com","passpasspass")).enqueue(new Callback<loginrsponse>() {
            @Override
            public void onResponse(Call<loginrsponse> call, Response<loginrsponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;
                    case 203:
                        // user is not validated
                        break;
                    case 408:
                        Toast.makeText((getApplicationContext()),"incorect password",Toast.LENGTH_LONG).show();
                        break;

                }
            }

            @Override
            public void onFailure(Call<loginrsponse> call, Throwable t) {

            }
        });
    }
    public void updateProfileStatus(File file){

        RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/from-data"),file);

        MultipartBody.Part body = MultipartBody.Part.createFormData("photo" ,file.getName() , requestBody);


        RequestBody api_token = RequestBody.create(MediaType.parse("text/plain"), "Wd6AqXT1AeU5wJANHnrCqjthobC2jio3SG39nJeZMa14UbFuNilxnlWsHzpKuD1X");
        RequestBody name = RequestBody.create(MediaType.parse("text/plain"), "medhat");
        RequestBody email = RequestBody.create(MediaType.parse("text/plain"), "test@gmail.com");
        RequestBody phone = RequestBody.create(MediaType.parse("text/plain"), "01011223388");
        RequestBody city_id = RequestBody.create(MediaType.parse("text/plain"), "1");
        RequestBody area_id = RequestBody.create(MediaType.parse("text/plain"), "8");

        RequestBody district = RequestBody.create(MediaType.parse("text/plain"), "ssss");
        RequestBody home = RequestBody.create(MediaType.parse("text/plain"), "hhhh");
        RequestBody street = RequestBody.create(MediaType.parse("text/plain"), "tttt");

        RetrofitWebService.getService().getupdateProfile(api_token,name,email,phone,city_id,area_id ,district,home,street,body).enqueue(new Callback<updateProfileresponse>() {
            @Override
            public void onResponse(Call<updateProfileresponse> call, Response<updateProfileresponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;
                    case 406:
                        Toast.makeText(getApplicationContext(),"this email is already exist",Toast.LENGTH_LONG).show();
                        break;
                    case 407:
                        Toast.makeText(getApplicationContext(),"this phone is already exist",Toast.LENGTH_LONG).show();
                        break;

                }
            }

            @Override
            public void onFailure(Call<updateProfileresponse> call, Throwable t) {

            }
        });
    }
    public void updatePasswordStatus(){
        RetrofitWebService.getService().getupdatePassword(new updatePasswordrequest("ahmed","oldpasspass","newpasspass")).enqueue(new Callback<updatePasswordresponse>() {
            @Override
            public void onResponse(Call<updatePasswordresponse> call, Response<updatePasswordresponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;
                    case 410:
                        Toast.makeText(getApplicationContext(),
                                "old password is not correct", Toast.LENGTH_LONG).show();
                        break;

                }
            }

            @Override
            public void onFailure(Call<updatePasswordresponse> call, Throwable t) {

            }
        });
    }
    public void productsStatus(){
        RetrofitWebService.getService().getproducts(new productsrequest(77)).enqueue(new Callback<productsresponse>() {
            @Override
            public void onResponse(Call<productsresponse> call, Response<productsresponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;

                }
            }

            @Override
            public void onFailure(Call<productsresponse> call, Throwable t) {

            }
        });
    }
    public void searchStatus(){
        RetrofitWebService.getService().getsearch(new searchrequest("ahmed","hm","Sd",500.5)).enqueue(new Callback<searchresponse>() {
            @Override
            public void onResponse(Call<searchresponse> call, Response<searchresponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;

                }
            }

            @Override
            public void onFailure(Call<searchresponse> call, Throwable t) {

            }
        });
    }
    public void adsStatus(){
        RetrofitWebService.getService().getads(new adsrequest()).enqueue(new Callback<adsresponse>() {
            @Override
            public void onResponse(Call<adsresponse> call, Response<adsresponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;

                }
            }

            @Override
            public void onFailure(Call<adsresponse> call, Throwable t) {

            }
        });
    }
    public void productInfoStatus(){
        RetrofitWebService.getService().getproductInfo(new productInforequest(15)).enqueue(new Callback<productInforesponse>() {
            @Override
            public void onResponse(Call<productInforesponse> call, Response<productInforesponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;

                }
            }

            @Override
            public void onFailure(Call<productInforesponse> call, Throwable t) {

            }
        });
    }
    public void addorderStatus(){
        RetrofitWebService.getService().getaddOrder(new addOrderrequest(14,15,16 , "token")).enqueue(new Callback<addOrderresponse>() {
                    @Override
                    public void onResponse(Call<addOrderresponse> call, Response<addOrderresponse> response) {
                        int status = response.body().getStatus();
                        switch (status)
                        {
                            case 200:
                                //success
                                break;
                            case 400:
                                Toast.makeText(getApplicationContext(),
                                        "please fill the required data", Toast.LENGTH_LONG).show();
                                break;
                            case 402:
                                // the account is deactivated by admin
                                break;
                            case 404:
                                // unknown
                                break;
                            case 405:
                                Toast.makeText(getApplicationContext(),
                                        "there is no data", Toast.LENGTH_LONG).show();
                                break;
                            case 204:
                                Toast.makeText(getApplicationContext(),
                                        "please enter a valid data", Toast.LENGTH_LONG).show();
                                break;
                            case 205:
                                Toast.makeText(getApplicationContext(),
                                        "required amount is not aviliable", Toast.LENGTH_LONG).show();
                                break;

                        }
                    }

                    @Override
                    public void onFailure(Call<addOrderresponse> call, Throwable t) {

                    }
                });
    }     // add in response class (String token )
    public void getOrderStatus(){
        RetrofitWebService.getService().getgetOrder(new getOrderrequest(15,"aaa" , "token")).enqueue(new Callback<getOrderresponse>() {
            @Override
            public void onResponse(Call<getOrderresponse> call, Response<getOrderresponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;

                }
            }

            @Override
            public void onFailure(Call<getOrderresponse> call, Throwable t) {

            }
        });
    }      // add in response class (String token )
    public void deleteOrderStatus(){
        RetrofitWebService.getService().getdeleteOrder(new deleteOrderrequest(15,77,"token")).enqueue(new Callback<deleteOrderresponse>() {
            @Override
            public void onResponse(Call<deleteOrderresponse> call, Response<deleteOrderresponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;
                }
            }

            @Override
            public void onFailure(Call<deleteOrderresponse> call, Throwable t) {

            }
        });
    }  // add in response class (String token )
    public void addbillesstatus(){

        ArrayList<Integer> orders = new ArrayList<>();
        orders.add(21);
        orders.add(24);

        addBillesrequest addBillesrequest = new addBillesrequest("Wd6AqXT1AeU5wJANHnrCqjthobC2jio3SG39nJeZMa14UbFuNilxnlWsHzpKuD1X",null,"pop",orders,20,"nile","Minia", "01012312312","ssss","tttt",1,"dist","cache");

       RetrofitWebService.getService().getaddBilles(addBillesrequest).enqueue(new Callback<addBillesresponse>() {
           @Override
           public void onResponse(Call<addBillesresponse> call, Response<addBillesresponse> response) {
               int status = response.body().getStatus();
               switch (status)
               {
                   case 200:
                       //success
                       Log.e("status is : " , "200");
                       break;
                   case 400:
                       Log.e("status is : " , "400");
                      // Toast.makeText(getApplicationContext(), "please fill the required data", Toast.LENGTH_LONG).show();
                       break;
                   case 402:
                       Log.e("status is : " , "402");
                       // the account is deactivated by admin
                       break;
                   case 404:
                       Log.e("status is : " , "404");
                       // unknown
                       break;
                   case 405:
                       Log.e("status is : " , "405");
                     //  Toast.makeText(getApplicationContext(), "there is no data", Toast.LENGTH_LONG).show();
                       break;
                   case 204:
                       Log.e("status is : " , "204");
                      // Toast.makeText(getApplicationContext(), "please enter a valid data", Toast.LENGTH_LONG).show();
                       break;

               }
           }

           @Override
           public void onFailure(Call<addBillesresponse> call, Throwable t) {
              Log.e("status ", "fail");
           }
       });
    }   // add in response class (String token , String name)
    public void getbillesStatus(){
        RetrofitWebService.getService().getgetBilles(new getBillesrequest(1)).enqueue(new Callback<getBillesresponse>() {
            @Override
            public void onResponse(Call<getBillesresponse> call, Response<getBillesresponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;

                }
            }

            @Override
            public void onFailure(Call<getBillesresponse> call, Throwable t) {

            }
        });
    }
    public void notificationRegisterationStatus(){
        RetrofitWebService.getService().getnotificationRegistration(new notificationRegistrationrequest("aaa","tok")).enqueue(new Callback<notificationRegistrationresponse>() {
            @Override
            public void onResponse(Call<notificationRegistrationresponse> call, Response<notificationRegistrationresponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;

                }
            }

            @Override
            public void onFailure(Call<notificationRegistrationresponse> call, Throwable t) {

            }
        });
    }
    public void product_mostViewStatus(){
        RetrofitWebService.getService().getProduct_mostView(new Product_mostViewrequest()).enqueue(new Callback<Product_mostViewresponse>() {
            @Override
            public void onResponse(Call<Product_mostViewresponse> call, Response<Product_mostViewresponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;

                }
            }

            @Override
            public void onFailure(Call<Product_mostViewresponse> call, Throwable t) {

            }
        });
    }   // update in class response products insted of product (plus s)
    public void colorStatus(){
        RetrofitWebService.getService().getColor(new colorRequest()).enqueue(new Callback<colorResponse>() {
            @Override
            public void onResponse(Call<colorResponse> call, Response<colorResponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;

                }
            }

            @Override
            public void onFailure(Call<colorResponse> call, Throwable t) {

            }
        });
    }
    public void brandStatus(){
        RetrofitWebService.getService().getbrand(new brandRequest()).enqueue(new Callback<brandResponse>() {
            @Override
            public void onResponse(Call<brandResponse> call, Response<brandResponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;

                }
            }

            @Override
            public void onFailure(Call<brandResponse> call, Throwable t) {

            }
        });
    }
    public void updateOrderStatus(){

        ArrayList<orderQuantity> orderQuantity = new ArrayList<orderQuantity>();
        orderQuantity.add(new orderQuantity(1,5));
        orderQuantity.add(new orderQuantity(2,4));

        RetrofitWebService.getService().getupdateOrder(orderQuantity,"Wd6AqXT1AeU5wJANHnrCqjthobC2jio3SG39nJeZMa14UbFuNilxnlWsHzpKuD1X").enqueue(new Callback<updateOrderResponse>() {
            @Override
            public void onResponse(Call<updateOrderResponse> call, Response<updateOrderResponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        Log.e("status","200");
                        //success
                        break;
                    case 400:
                        Log.e("status","400");
                        //Toast.makeText(getApplicationContext(), "required token ", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        Log.e("status","402");
                        // the account is deactivated by admin
                        break;
                    case 404:
                        Log.e("status","404");
                        // unknown
                        break;
                    case 405:
                        Log.e("status","405");
                     //   Toast.makeText(getApplicationContext(), "this token is exist", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Log.e("status","204");
                      //  Toast.makeText(getApplicationContext(), "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;

                    case 210:
                        Log.e("status","210");
                     //   Toast.makeText(getApplicationContext(), "There is no available quantity for this order", Toast.LENGTH_LONG).show();
                        break;

                }
            }

            @Override
            public void onFailure(Call<updateOrderResponse> call, Throwable t) {

            }
        });
    }   // edit in request class and plus status case

    public void visitorStatus()   // new function + visitorrequest + visitorResponse
    {
        RetrofitWebService.getService().getVisitor(new visitorrequest("ffffff")).enqueue(new Callback<visitorResponse>() {
            @Override
            public void onResponse(Call<visitorResponse> call, Response<visitorResponse> response) {
                int status = response.body().getStatus();
                switch (status)
                {
                    case 200:
                        //success
                        break;
                    case 400:
                        Toast.makeText(getApplicationContext(),
                                "please fill the required data", Toast.LENGTH_LONG).show();
                        break;
                    case 402:
                        // the account is deactivated by admin
                        break;
                    case 404:
                        // unknown
                        break;
                    case 405:
                        Toast.makeText(getApplicationContext(),
                                "there is no data", Toast.LENGTH_LONG).show();
                        break;
                    case 204:
                        Toast.makeText(getApplicationContext(),
                                "please enter a valid data", Toast.LENGTH_LONG).show();
                        break;

                }
            }

            @Override
            public void onFailure(Call<visitorResponse> call, Throwable t) {

            }
        });


    }
}
