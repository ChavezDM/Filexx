class BloodData {
    static String bloodType;
    static String rhFactor;
    public BloodData(){
        bloodType = "o";
        rhFactor = "+";
    }
    public void BloodData(String bt, String rh){
        bloodType = bt;
        rhFactor = rh;
    }
    public void display(){
        System.out.println(bloodType + rhFactor + " is added to the blood bank.");
    }
}
