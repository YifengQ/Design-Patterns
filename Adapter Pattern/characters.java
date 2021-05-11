public abstract class characters{
    Guitar guitar; 
    Solo Act;
    public characters(){
    }
   
    public void changeGuitar(Guitar change_guitar){
        //guitar.changeGuitar(change_guitar);
        guitar = change_guitar;
        //guitar.changeGuitar();
     }
    public void playGuitar(){
        guitar.playGuitar();
    }

    public void playSolo(){
        Act.playSolo();
    }

}