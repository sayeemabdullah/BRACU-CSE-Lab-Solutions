function getSorted = insertionSorting(x)
n = length(x);
for i = 2:n
    j = i-1;
    index = i; 
    while(j >= 1)
        if(x(index) < x(j)) 
            temp = x(j);
            x(j) = x(index);
            x(index) = temp;
            index = j;
        end
        j=j-1;
    end
end
getSorted = x;
getSorted=fliplr(getSorted);
end


