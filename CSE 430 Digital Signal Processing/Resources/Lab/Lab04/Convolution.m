clc;
clear all;
close all;

h=[1 2 1 -1];  %values of h
h_id=[-1:2];   %index of h
x=[1 2 3 3 3 3 1];   %values of x
x_id=[0:6];    %index of x

idmin=h_id(1)+x_id(1);
idmax=h_id(end)+x_id(end);
id_y=idmin:idmax;  %generating index of the result/convolution output

for n=1:length(id_y)
    [h1_id,h1]=sigfold(h_id,h);  %folding the signal
    h1_id=h1_id+id_y(n);   %shifting the folded signal
    p=zeros(1,length(h1_id));

for k=1:length(h1_id)   % for doing sum of x(k)*h(n-k)
i=h1_id(k);         %finding index h1
        i2=find(x_id==i);   %matching the corresponding index from x
if (i2)
            p(k)=h1(k)*x(i2);
end
end
    y(n)=sum(p);            %result/convolution sum
end
subplot(311),stem(x_id,x),title('input signal'),axis([idmin idmax -10 10])
subplot(312),stem(h_id,h),title('impulse response signal'),axis([idmin idmax -10 10])
subplot(313),stem(id_y,y),title('output signal'),axis([idmin idmax -10 10])
