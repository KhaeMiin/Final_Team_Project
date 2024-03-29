package data.comment;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonFormat;

@Alias("CMDTO")
@Getter @Setter
public class CommentDTO {
	private int num;
	private int pnum;
	private int fix;
	private int grp;
	private int grph;
	private int grps;
	private int tempdel;
	private int parent_num;
	private String parent;
	private String writer;
	private String photo;
	private String content;
	@JsonFormat(pattern = "yyyy.MM.dd hh:mm")
	private Timestamp writetime;

}
