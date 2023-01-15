close all
clear all
clc

n=-10:10;

f=(n >= 0 );

figure,
subplot(3,1,1),stem(n,f)
title('Unit Step Signal');
xlabel('n');
ylabel('u(n)');

t=(n-1 >=0);
subplot(3,1,2), stem(n,f)
title('Unit Step Signal');
xlabel('n');
ylabel('u(n-1)');

m=f-t;
subplot(3,1,3), stem (n,m)
title('Unit Sample Signal');
xlabel('n');
ylabel('delta(n)');

