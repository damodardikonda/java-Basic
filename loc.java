class COVID19{

      COVID19(){

         System.out.println("in covid constructor");
     }

}



class Lockdown extends COVID19 {

     Lockdown() {

          System.out.println("in constructor");

    }

static public void main(String args[]){


        Lockdown obj = new Lockdown();
        System.out.println("heeyyyyyyyyyyyyyyyy");
}







}