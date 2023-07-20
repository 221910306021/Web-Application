
var firstName='DVL';
console.log('FirstName '+firstName);
var lastName='Sucharitha';
console.log('LastName : '+ lastName );
console.log('FullName : '+firstName+' '+lastName);
var _years=20;
var x='DVL Sucharitha';
console.log(_years);
console.log(x);
var age=28;
//type coercion and variable mutation
console.log(lastName+' '+age);
age='twenty eight';
console.log(lastName+' '+age);
var year,year1,year2;
now=2019;
ageX=28;
ageY=33;

year1 = now - ageX;
year2 = now - ageY;
console.log(year1);
console.log(now + 2);
console.log(now * 2);
console.log(now / 10);

var Z = ageX > ageY;
console.log(Z);

console.log(typeof ageX);
console.log(typeof lastName);
var yearX=1989;
var fullAge=18;
var isFullAge=(now - yearX) >= fullAge;
console.log(isFullAge); 
var x=10;
console.log(x);
x+=10;// x+=10 => x=x+10;
console.log(x);
x--; // x--=> x=x-1
console.log(x);

x=10;
y=10;
var civilStatus='Single';
if(civilStatus === 'Married')
  {console.log(lastName + 'is married');}
else
 { console.log(lastName + 'is single');}

var isMarried=true;
if(isMarried)
{console.log(lastName + 'is married');}
else
 { console.log(lastName + 'is single');}

 var age =20;
 if(age<13)
  console.log(lastName + ' is a boy');
  else if(age>=13 && age<20)
  console.log(lastName + ' is a teenager');
  else if(age>=20 && age<30)
  console.log(lastName + ' is a young man');
  else
  console.log(lastName + ' is a Man');

  //ternary Operators
  var t = (age>=18)  ? 'Youngman':'Boy';
  console.log(t);

  switch(true){
      case age <=13 :
      {console.log(' is a boy');
      break;}
      case age>=13 && age<20 :
      {console.log(' is a teenager');
      break;}
      case age>=20 && age <30 :
      {console.log('is a young man');
      break;}
      default :
      {console.log('is a Man');}
  }
  var height;
  height=23;
  if(height || height === 0)
    console.log('variable is defined');
    else
    console.log('variable is undefined');