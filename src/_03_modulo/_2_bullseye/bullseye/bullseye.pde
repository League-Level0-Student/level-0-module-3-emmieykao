
void setup() {
 
  // set the size of your sketch
  size(500, 500);
}

void draw() {
  int x=250;
  for (int i = 0; i<8; i++){

  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.

  //Use an if statement and modulo to alternate the color of your rings.
  if(i%2==0){
    fill(255, 0, 0);
  ellipse(250, 250, x, x);}
  
  else{
    fill(0, 0, 0);
    ellipse(250, 250, x, x);}
    x=x-30;
}}
