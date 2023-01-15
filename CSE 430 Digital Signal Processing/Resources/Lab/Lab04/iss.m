clc
close all
a=[1, 0.6];
b=[1];
n=-10:20; %generating index
figure,
%Finding Impulse Response
x=zeros(1,length(n));
ir=find(n==0);
x(ir)=1; %generating impulse sequence
y=filter(b,a,x),
subplot(3,1,1)
stem(n,y)
xlabel('n')
title('impulse response')

%Finding Step Response
x=zeros(1,length(n));
sr=find(n>=0);
x(sr)=1; %generating impulse sequence
y=filter(b,a,x),
subplot(3,1,2)
stem(n,y)
xlabel('n')
title('step response')

%Finding Sinusoidal Response
f=1/15;
x=0.5*sin(2*pi*f*n);
y=filter(b,a,x);
subplot(3,1,3)
stem(n,y)
xlabel('n')
title('sinusoidal response')
