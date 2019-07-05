clc;
row = input('Enter Row :');
value = (row*2)-1;
temp=1;

for  i=1 : 1 : row
    for  j=1 : 1 : value/2
        fprintf(" ");
end
    for  j=1 : 1 : temp
        fprintf("*");
end
    temp=temp+2;
    display(" ");
    value=value-2;
end