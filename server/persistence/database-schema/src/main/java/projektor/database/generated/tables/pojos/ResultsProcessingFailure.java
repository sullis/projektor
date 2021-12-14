/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ResultsProcessingFailure implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        publicId;
    private String        body;
    private LocalDateTime createdTimestamp;
    private String        failureMessage;
    private String        failureType;
    private String        bodyType;

    public ResultsProcessingFailure() {}

    public ResultsProcessingFailure(ResultsProcessingFailure value) {
        this.publicId = value.publicId;
        this.body = value.body;
        this.createdTimestamp = value.createdTimestamp;
        this.failureMessage = value.failureMessage;
        this.failureType = value.failureType;
        this.bodyType = value.bodyType;
    }

    public ResultsProcessingFailure(
        String        publicId,
        String        body,
        LocalDateTime createdTimestamp,
        String        failureMessage,
        String        failureType,
        String        bodyType
    ) {
        this.publicId = publicId;
        this.body = body;
        this.createdTimestamp = createdTimestamp;
        this.failureMessage = failureMessage;
        this.failureType = failureType;
        this.bodyType = bodyType;
    }

    /**
     * Getter for <code>public.results_processing_failure.public_id</code>.
     */
    public String getPublicId() {
        return this.publicId;
    }

    /**
     * Setter for <code>public.results_processing_failure.public_id</code>.
     */
    public ResultsProcessingFailure setPublicId(String publicId) {
        this.publicId = publicId;
        return this;
    }

    /**
     * Getter for <code>public.results_processing_failure.body</code>.
     */
    public String getBody() {
        return this.body;
    }

    /**
     * Setter for <code>public.results_processing_failure.body</code>.
     */
    public ResultsProcessingFailure setBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Getter for
     * <code>public.results_processing_failure.created_timestamp</code>.
     */
    public LocalDateTime getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * Setter for
     * <code>public.results_processing_failure.created_timestamp</code>.
     */
    public ResultsProcessingFailure setCreatedTimestamp(LocalDateTime createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    /**
     * Getter for
     * <code>public.results_processing_failure.failure_message</code>.
     */
    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * Setter for
     * <code>public.results_processing_failure.failure_message</code>.
     */
    public ResultsProcessingFailure setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
        return this;
    }

    /**
     * Getter for <code>public.results_processing_failure.failure_type</code>.
     */
    public String getFailureType() {
        return this.failureType;
    }

    /**
     * Setter for <code>public.results_processing_failure.failure_type</code>.
     */
    public ResultsProcessingFailure setFailureType(String failureType) {
        this.failureType = failureType;
        return this;
    }

    /**
     * Getter for <code>public.results_processing_failure.body_type</code>.
     */
    public String getBodyType() {
        return this.bodyType;
    }

    /**
     * Setter for <code>public.results_processing_failure.body_type</code>.
     */
    public ResultsProcessingFailure setBodyType(String bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ResultsProcessingFailure other = (ResultsProcessingFailure) obj;
        if (publicId == null) {
            if (other.publicId != null)
                return false;
        }
        else if (!publicId.equals(other.publicId))
            return false;
        if (body == null) {
            if (other.body != null)
                return false;
        }
        else if (!body.equals(other.body))
            return false;
        if (createdTimestamp == null) {
            if (other.createdTimestamp != null)
                return false;
        }
        else if (!createdTimestamp.equals(other.createdTimestamp))
            return false;
        if (failureMessage == null) {
            if (other.failureMessage != null)
                return false;
        }
        else if (!failureMessage.equals(other.failureMessage))
            return false;
        if (failureType == null) {
            if (other.failureType != null)
                return false;
        }
        else if (!failureType.equals(other.failureType))
            return false;
        if (bodyType == null) {
            if (other.bodyType != null)
                return false;
        }
        else if (!bodyType.equals(other.bodyType))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.publicId == null) ? 0 : this.publicId.hashCode());
        result = prime * result + ((this.body == null) ? 0 : this.body.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        result = prime * result + ((this.failureMessage == null) ? 0 : this.failureMessage.hashCode());
        result = prime * result + ((this.failureType == null) ? 0 : this.failureType.hashCode());
        result = prime * result + ((this.bodyType == null) ? 0 : this.bodyType.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ResultsProcessingFailure (");

        sb.append(publicId);
        sb.append(", ").append(body);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(failureMessage);
        sb.append(", ").append(failureType);
        sb.append(", ").append(bodyType);

        sb.append(")");
        return sb.toString();
    }
}
