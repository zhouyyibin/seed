package seed.tools;

/**
 * web resultful 接口请求处理结果对象。用于规范resultful请求结果的数据结构。
 *
 */
public class RestfulResult {

    public static final int SC_OK = 200;

    public static final int SC_INTERNAL_ERROR = 500;

    /**
     * 使用默认设置，同时无业务数据时，返回成功处理的响应结果。
     * @return 响应结果
     */
    public static RestfulResult success() {
        return new RestfulResult(true, SC_OK, null, null);
    }

    /**
     * 使用默认设置，返回成功处理的响应结果。
     * @param data 业务数据
     * @return 响应结果
     */
    public static RestfulResult success(Object data) {
        return new RestfulResult(true, SC_OK, data, null);
    }

    /**
     * 使用默认设置,返回只存在状态的响应结果。状态不是200时,success均为false
     * @param code 状态码
     * @return 响应结果
     */
    public static RestfulResult status(int code) {
        return new RestfulResult(code == 200, code, null, null);
    }

    /**
     * 使用默认设置，失败时返回内部错误的响应结果。
     * @return 响应结果
     */
    public static RestfulResult failure() {
        return new RestfulResult(false, SC_INTERNAL_ERROR, null, null);
    }

    /**
     * 使用默认设置，返回处理失败的响应结果。
     * @param code 失败代码
     * @return 响应结果
     */
    public static RestfulResult failure(int code) {
        return new RestfulResult(false, code, null, null);
    }

    /**
     * 使用默认设置，返回处理失败的响应结果。
     * @param code 失败代码
     * @param data 失败数据
     * @return 响应结果
     */
    public static RestfulResult failure(int code ,Object data) {
        return new RestfulResult(false, code, data, null);
    }

    public static RestfulResult failure(int code, Exception error) {
        return new RestfulResult(false, code, null, error.getMessage());
    }

    private boolean success;

    private int code;

    private Object data;

    private String msg;

    /**
     * 使用各个字段实例对象。
     * @param success 处理结果
     * @param code 状态码
     * @param data 业务数据
     * @param msg 返回说明
     */
    public RestfulResult(boolean success, int code, Object data, String msg) {
        this.success = success;
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    /**
     * 获取本次请求的处理结果是否成功。
     * @return 处理结果
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * 设置本次请求的处理结果是否成功。
     * @param success 处理结果
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * 获取本次请求的状态码。
     * @return 状态码
     */
    public int getCode() {
        return code;
    }

    /**
     * 设置本次请求的状态码。
     * 改属性必须为500。(注:改状态码与http status code有所区别)
     * @param code 状态码
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * 获取本次请求的业务数据。
     * @return 业务数据
     */
    public Object getData() {
        return data;
    }

    /**
     * 设置本次请求的业务数据。
     * @param data 业务数据
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 获取本次请求的返回说明。
     * @return 错误信息
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置本次请求的返回说明。
     * @param msg 错误信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 使用异常对象，设置本次请求的错误信息。
     * @param error 错误信息
     */
    public void setMsg(Throwable error) {
        this.msg = error.getMessage();
    }

}
