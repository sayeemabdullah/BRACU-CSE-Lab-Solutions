function [result] = lagrange(x,y,xx)
    n=3;
for i= 1:n+1
    S(i) = 1.0;
for j = 1: n+1
    if j~=i
    S(i) = (S(i) * (xx-x(j))) / (x(i)-x(j));
    end
end
end
    fxu=0.0;
for i = 1:n+1
    fxu = fxu + S(i) * y(i);
end
    result=fxu
end

