function [id_y,y]=convol(x,x_id,h,h_id)
    idmin=h_id(1)+x_id(1);
    idmax=h_id(end)+x_id(end);
    id_y=idmin:idmax;
    y=conv(x,h);
end