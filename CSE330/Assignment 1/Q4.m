clc;
row = 8;

for  i=1 : 1 : row
    for  j=1 : 1 : row-i
       fprintf(" ");
    end
for  j=1 : 1 : i
    if(i<row)
    if ((j==1 || j==i) && j==1)
      fprintf("1"); 
    elseif((j==1 || j==i) && j==2)
      fprintf("7");
    elseif((j==1 || j==i) && j==3)
      fprintf("1");
    elseif((j==1 || j==i) && j==4)
      fprintf("0");
    elseif((j==1 || j==i) && j==5)
      fprintf("1");
    elseif((j==1 || j==i) && j==6)
      fprintf("0");
    elseif((j==1 || j==i) && j==7)
      fprintf("0");
    elseif((j==1 || j==i) && j==8)
      fprintf("9");
    else
      fprintf(" ");
    end
else
    if(j==1)
    fprintf("1");
    elseif(j==2)
    fprintf("7");
    elseif(j==3)
    fprintf("1");
    elseif(j==4)
    fprintf("0");
    elseif(j==5)
    fprintf("1");
    elseif(j==6)
    printf("0");
    elseif(j==7)
    fprintf("0");
    elseif(j==8)
    fprintf("9");
end
end
end
    display(" ");
end