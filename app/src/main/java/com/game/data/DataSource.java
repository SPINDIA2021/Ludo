package com.game.data;


import com.game.network.NetworkCall;
import com.game.network.ServiceCallBack;

public interface DataSource {


    void getAdKeys(ServiceCallBack myAppointmentPresenter, NetworkCall networkCall);


}

