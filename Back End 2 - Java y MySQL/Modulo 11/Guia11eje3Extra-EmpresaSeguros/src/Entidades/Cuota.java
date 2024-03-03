package Entidades;

import java.util.Date;
import java.util.Objects;

public class Cuota {

    private Integer numeroDeCuotas;
    private Double montoTotal;
    private boolean pagada;
    private Date fechaVencimiento;
    private String formaDePago;

    public Cuota() {
    }

    public Cuota(Integer numeroDeCuotas, Double montoTotal, boolean pagada, Date fechaVencimiento, String formaDePago) {
        this.numeroDeCuotas = numeroDeCuotas;
        this.montoTotal = montoTotal;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaDePago = formaDePago;
    }

    public Integer getNumeroDeCuotas() {
        return numeroDeCuotas;
    }

    public void setNumeroDeCuotas(Integer numeroDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.numeroDeCuotas);
        hash = 97 * hash + Objects.hashCode(this.montoTotal);
        hash = 97 * hash + (this.pagada ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.fechaVencimiento);
        hash = 97 * hash + Objects.hashCode(this.formaDePago);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuota other = (Cuota) obj;
        if (this.pagada != other.pagada) {
            return false;
        }
        if (!Objects.equals(this.formaDePago, other.formaDePago)) {
            return false;
        }
        if (!Objects.equals(this.numeroDeCuotas, other.numeroDeCuotas)) {
            return false;
        }
        if (!Objects.equals(this.montoTotal, other.montoTotal)) {
            return false;
        }
        return Objects.equals(this.fechaVencimiento, other.fechaVencimiento);
    }

    @Override
    public String toString() {
        return "Cuota{" + "numeroDeCuotas=" + numeroDeCuotas + ", montoTotal=" + montoTotal + ", pagada=" + pagada + ", fechaVencimiento=" + fechaVencimiento + ", formaDePago=" + formaDePago + '}';
    }
    
}
