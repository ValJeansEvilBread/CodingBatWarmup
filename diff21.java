public int diff21(int n) {
  if(n>21){
    return 2*(n-21);
  } else {
    return Math.abs(n-21);
  }
}
