package org.example.hotel;

import java.util.Scanner;

public interface FormClient {

    public Client addClient(String firstNAme, String lastNAme, String phone, String mail );

    public Resa addResa(int nbResa, RoomStatus roomStatus, Client client,int nbRoom);

    public RoomStatus ResaStatus(long idResa);


    }

