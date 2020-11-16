package edu.epam.decomposition.task6.service;

import edu.epam.decomposition.task6.entity.Time;
import java.util.ArrayList;

public class TimeCalculatingService {
    public ArrayList<Integer> calculateTime(Time secNow) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(0,(int)secNow.getSeconds()/3600);
      int remainingMinutes= secNow.getSeconds()-arrayList.get(0)*3600;
       arrayList.add(1,(int)remainingMinutes/60);
       int remainingSeconds=remainingMinutes-arrayList.get(1)*60;
       arrayList.add(2,remainingSeconds);
        return arrayList;
        }
    }

