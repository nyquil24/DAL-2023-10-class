//package org.example;
//
//
//class Cricket  implements Sport{
//    private int[] playerIDs;
//
//    public Cricket(){
//        playerIDs = new int[11];
//        for(int i = 0; i < playerIDs.length; i++){
//            playerIDs[i] = 1;
//        }
//        System.out.println("A new cricket team has been formed");
//    }
//
//    public void calculateAvgAge(int[] age){
//        int sum = 0;
//        for(int i = 0; i < age.length; i++){
//            sum += age[i];
//        }
//        double average = (double) sum/age.length;
//        System.out.printf("The average age of the team is %.2f%n", average);
//    }
//
//    public void retirePlayer(int id){
//        if(id >= 0 && id < playerIDs.length){
//            if(playerIDs[id] == -1){;
//                System.out.println("Player has already retired");
//            }else{
//                playerIDs[id] = -1;
//                System.out.println("Player with id: " + id + " has retired.");
//            }
//        }
//    }
//}
//
//class Football{
//    private int[] playerIDs;
//
//    public Football(){
//        playerIDs = new int[11];
//        for(int i = 0; i < playerIDs.length; i++){
//            playerIDs[i] = 1;
//        }
//        System.out.println("A new football team has been formed");
//    }
//
//    public void calculateAvgAge(int[] age){
//        int sum = 0;
//        for(int i = 0; i < age.length; i++){
//            sum += age[i];
//        }
//        double average = (double) sum/age.length;
//        System.out.printf("The average age of the team is %.2f%n", average);
//    }
//
//    public void retirePlayer(int id){
//        if (id >= 0 && id < playerIDs.length){
//            if(playerIDs[id] == -1){
//                System.out.println("Player has already retired.");
//            }else{
//                playerIDs[id] = -1;
//                System.out.println("Player with id: " + id + " has retired.");
//            }
//        }
//    }
//
//    public void playerTransfer(int fee, int id){
//        if (id >= 0 && id < playerIDs.length){
//            if (playerIDs[id] == -1){
//                System.out.println("Player has already retired");
//            } else {
//                System.out.println("Player with id: " + id + " has been transferred with a fee of " + fee);
//            }
//        }
//    }
//}
//
