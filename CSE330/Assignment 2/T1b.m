clc;
theorySection=4;
n=7*theorySection;
function [series] = fibonacci (n)
series=[0 1];
for i=1:n
    a=series(i)+series(i+1);
    series=[series a];
end
end
output=fibonacci (n)
