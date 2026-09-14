package jp.co.sss.lms.form;

import lombok.Data;

/**
 * 日次の勤怠フォーム
 * 
 * @author 東京ITスクール
 */
@Data
public class DailyAttendanceForm {

	/** 受講生勤怠ID */
	private Integer studentAttendanceId;
	/** 途中退校日 */
	private String leaveDate;
	/** 日付 */
	private String trainingDate;
	/** 出勤時間 */
	private String trainingStartTime;
	
	/** Task.26 岩月 出退勤時間の入力方法変更　ここから*/
	/** 出勤時間(時) */
	private Integer trainingStartTimeHour;
	/** 出勤時間 (分)*/
	private Integer trainingStartTimeMinute;
	//Task.26 岩月 出退勤時間の入力方法変更　ここまで
	/** 退勤時間 */
	private String trainingEndTime;
	//Task.26 岩月 出退勤時間の入力方法変更　ここから
	/** 退勤時間 (時)*/
	private Integer trainingEndTimeHour;
	/** 退勤時間 (分)*/
	private Integer trainingEndTimeMinute;
	//Task.26 岩月 出退勤時間の入力方法変更　ここまで
	/** 中抜け時間 */
	private Integer blankTime;
	/** 中抜け時間（画面表示用） */
	private String blankTimeValue;
	/** ステータス */
	private String status;
	/** 備考 */
	private String note;
	/** セクション名 */
	private String sectionName;
	/** 当日フラグ */
	private Boolean isToday;
	/** エラーフラグ */
	private Boolean isError;
	/** 日付（画面表示用） */
	private String dispTrainingDate;
	/** ステータス（画面表示用） */
	private String statusDispName;
	/** LMSユーザーID */
	private String lmsUserId;
	/** ユーザー名 */
	private String userName;
	/** コース名 */
	private String courseName;
	/** インデックス */
	private String index;

}
