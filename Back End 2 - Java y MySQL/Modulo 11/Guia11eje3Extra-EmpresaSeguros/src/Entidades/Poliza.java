package Entidades;

import java.util.Date;
import java.util.Objects;

public class Poliza {

    private Cliente cliente;
    private Vehiculo vehiculo;
    private Integer numeroPoliza;
    private Date fechaInicio;
    private Date fechaVencimiento;
    private Cuota cuota;
    private Double montoTotalAsegurado;
    private boolean incluyeGranizo;
    private Double montoMaximoGranizo;
    private String tipoCobertura;
    
    public Poliza() {
    }

    public Poliza(Cliente cliente, Vehiculo vehiculo, Integer numeroPoliza, Date fechaInicio, Date fechaVencimiento, Cuota cuota, Double montoTotalAsegurado, boolean incluyeGranizo, Double montoMaximoGranizo, String tipoCobertura) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.cuota = cuota;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Integer getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(Integer numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Cuota getCuota() {
        return cuota;
    }

    public void setCuota(Cuota cuota) {
        this.cuota = cuota;
    }

    public Double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(Double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public Double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(Double montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.cliente);
        hash = 23 * hash + Objects.hashCode(this.vehiculo);
        hash = 23 * hash + Objects.hashCode(this.numeroPoliza);
        hash = 23 * hash + Objects.hashCode(this.fechaInicio);
        hash = 23 * hash + Objects.hashCode(this.fechaVencimiento);
        hash = 23 * hash + Objects.hashCode(this.cuota);
        hash = 23 * hash + Objects.hashCode(this.montoTotalAsegurado);
        hash = 23 * hash + (this.incluyeGranizo ? 1 : 0);
        hash = 23 * hash + Objects.hashCode(this.montoMaximoGranizo);
        hash = 23 * hash + Objects.hashCode(this.tipoCobertura);
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
        final Poliza other = (Poliza) obj;
        if (this.incluyeGranizo != other.incluyeGranizo) {
            return false;
        }
        if (!Objects.equals(this.tipoCobertura, other.tipoCobertura)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.vehiculo, other.vehiculo)) {
            return false;
        }
        if (!Objects.equals(this.numeroPoliza, other.numeroPoliza)) {
            return false;
        }
        if (!Objects.equals(this.fechaInicio, other.fechaInicio)) {
            return false;
        }
        if (!Objects.equals(this.fechaVencimiento, other.fechaVencimiento)) {
            return false;
        }
        if (!Objects.equals(this.cuota, other.cuota)) {
            return false;
        }
        if (!Objects.equals(this.montoTotalAsegurado, other.montoTotalAsegurado)) {
            return false;
        }
        return Objects.equals(this.montoMaximoGranizo, other.montoMaximoGranizo);
    }

    @Override
    public String toString() {
        return "Poliza{" + "cliente=" + cliente + ", vehiculo=" + vehiculo + ", numeroPoliza=" + numeroPoliza + ", fechaInicio=" + fechaInicio + ", fechaVencimiento=" + fechaVencimiento + ", cuota=" + cuota + ", montoTotalAsegurado=" + montoTotalAsegurado + ", incluyeGranizo=" + incluyeGranizo + ", montoMaximoGranizo=" + montoMaximoGranizo + ", tipoCobertura=" + tipoCobertura + '}';
    }
    
    
}
