//Solution assuming a and b both equalling 10 returns true (how the exercise interprets that case):

public boolean makes10(int a, int b) {
  if (a == 10 || b == 10 || a+b == 10){
    return true;
  }else{
    return false;
  }
}


//Solution assuming a and b both equalling 10 returns false ("return true if one of them is 10"):

public boolean makes10(int a, int b) {
  if ((a == 10 || b ==10) && (a != b) ){
    return true;
  }else if (a+b == 10){
    return true;
  }else{
    return false;
  }
}