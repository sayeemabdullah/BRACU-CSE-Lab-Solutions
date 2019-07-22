function [bin] = dec2bin(num)
bin='';
while (1)
    if(num==0||num==1)
    bin=strcat(num2str(num),bin);
    break;
    end
    b=mod(num,2);
    bin=strcat(num2str(b),bin);
    num=floor(num/2);
end
end
