clc;
clear all;
x=[65 61 57 56 66 78 77 54 70 76 66 64 75 72 67 73 74 80 84 70 64 86 73];
y=[585.17 263.42 623.93 449.32 370.56 1518.81 1214.81 644.57 714.26 773.32 1405.40 519.31 1153.30 677.71 863.75 880.16 853.97 1346.91 2048.35 622.67 1128.27 2773.35 603.77];
n=23;
r=88;
function e=regression(x,y,n,r);
sumx=0;
for i=1:length(x)
    sumx=sumx+x(i);
end
sumy=0;
for i=1:length(y)
    sumy=sumy+y(i);
end
sumxy=0;
for i=1:n
    sumxy=sumxy+x(i)*y(i);
end
sumx2=0;
for i=1:length(x)
    a=x.^2;
    sumx2=sumx2+a(i);
end
a1=(n*sumxy-sumx*sumy)/(n*sumx2-sumx^2);
a0=sumy/n-a1*(sumx/n);
e=a0+a1*r;
fit= polyfit(x,y,1);
scatter(x,y),xlabel('Review (in %)'),ylabel('Earnings (in millions)'),title('Earnings vs Reviews'),grid on;
hold on;
plot(x,polyval(fit,x)),legend(plot(x,polyval(fit,x)),'y=a0+a1*x');
plot(v,r),stem(v,r),legend(plot(v,e),'Estimated earnings for 88% +ve reviews');
hold off;
end

