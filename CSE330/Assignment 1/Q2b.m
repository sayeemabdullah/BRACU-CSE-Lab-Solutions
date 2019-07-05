clc;
row = input('Enter Row :');

for  i=1 : 1 : row
    for  j=1 : 1 : i
if(i<row)
    if(j==1 || j==i)
      fprintf("*");
      else
      fprintf(' ');
    end
else
    fprintf("*");
end
end
    display(" ");
end