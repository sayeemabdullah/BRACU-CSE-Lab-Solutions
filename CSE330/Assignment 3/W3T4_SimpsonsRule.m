function [result] = simpsonsrule(f,xl,xu,h)
n=1;
x=xl: h: xu;
for i=1: 1: length(x)
    y(n) = f(x(i));
    n = n+1;
end
even = 0;
odd = 0;
for i=2: 1: length(y)-1
    if(mod(i,2) == 0)
        even = even + y(i);
    else
        odd = odd + y(i);
    end
end
l = length(y);
result = (h/3)*(y(1)+y(l)+2*odd+4*even);
end

