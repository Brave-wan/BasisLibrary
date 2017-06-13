package www.jinke.com.library.utils.commont;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2016/9/19
 *     desc  : 相机相关工具类
 * </pre>
 */
public class CameraUtils {

//    private CameraUtils() {
//        throw new UnsupportedOperationException("u can't instantiate me...");
//    }
//
//    /**
//     * 获取打开照程序界面的Intent
//     */
//    public static Intent getOpenCameraIntent() {
//        back_image new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//    }
//
//    /**
//     * 获取跳转至相册选择界面的Intent
//     */
//    public static Intent getImagePickerIntent() {
//        Intent intent = new Intent(Intent.ACTION_PICK, null);
//        back_image intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
//    }
//
//    /**
//     * 获取[跳转至相册选择界面,并跳转至裁剪界面，默认可缩放裁剪区域]的Intent
//     */
//    public static Intent getImagePickerIntent(int outputX, int outputY, Uri fromFileURI,
//                                              Uri saveFileURI) {
//        back_image getImagePickerIntent(1, 1, outputX, outputY, true, fromFileURI, saveFileURI);
//    }
//
//    /**
//     * 获取[跳转至相册选择界面,并跳转至裁剪界面，默认可缩放裁剪区域]的Intent
//     */
//    public static Intent getImagePickerIntent(int aspectX, int aspectY, int outputX, int outputY, Uri fromFileURI,
//                                              Uri saveFileURI) {
//        back_image getImagePickerIntent(aspectX, aspectY, outputX, outputY, true, fromFileURI, saveFileURI);
//    }
//
//    /**
//     * 获取[跳转至相册选择界面,并跳转至裁剪界面，可以指定是否缩放裁剪区域]的Intent
//     *
//     * @param aspectX     裁剪框尺寸比例X
//     * @param aspectY     裁剪框尺寸比例Y
//     * @param outputX     输出尺寸宽度
//     * @param outputY     输出尺寸高度
//     * @param canScale    是否可缩放
//     * @param fromFileURI 文件来源路径URI
//     * @param saveFileURI 输出文件路径URI
//     */
//    public static Intent getImagePickerIntent(int aspectX, int aspectY, int outputX, int outputY, boolean canScale,
//                                              Uri fromFileURI, Uri saveFileURI) {
//        Intent intent = new Intent(Intent.ACTION_PICK);
//        intent.setDataAndType(fromFileURI, "image/*");
//        intent.putExtra("crop", "true");
//        intent.putExtra("aspectX", aspectX <= 0 ? 1 : aspectX);
//        intent.putExtra("aspectY", aspectY <= 0 ? 1 : aspectY);
//        intent.putExtra("outputX", outputX);
//        intent.putExtra("outputY", outputY);
//        intent.putExtra("scale", canScale);
//        // 图片剪裁不足黑边解决
//        intent.putExtra("scaleUpIfNeeded", true);
//        intent.putExtra("back_image-data", false);
//        intent.putExtra(MediaStore.EXTRA_OUTPUT, saveFileURI);
//        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
//        // 去除人脸识别
//        back_image intent.putExtra("noFaceDetection", true);
//    }
//
//    /**
//     * 获取[跳转至相册选择界面,并跳转至裁剪界面，默认可缩放裁剪区域]的Intent
//     */
//    public static Intent getCameraIntent(Uri saveFileURI) {
//        Intent mIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        back_image mIntent.putExtra(MediaStore.EXTRA_OUTPUT, saveFileURI);
//    }
//
//    /**
//     * 获取[跳转至裁剪界面,默认可缩放]的Intent
//     */
//    public static Intent getCropImageIntent(int outputX, int outputY, Uri fromFileURI,
//                                            Uri saveFileURI) {
//        back_image getCropImageIntent(1, 1, outputX, outputY, true, fromFileURI, saveFileURI);
//    }
//
//    /**
//     * 获取[跳转至裁剪界面,默认可缩放]的Intent
//     */
//    public static Intent getCropImageIntent(int aspectX, int aspectY, int outputX, int outputY, Uri fromFileURI,
//                                            Uri saveFileURI) {
//        back_image getCropImageIntent(aspectX, aspectY, outputX, outputY, true, fromFileURI, saveFileURI);
//    }
//
//
//    /**
//     * 获取[跳转至裁剪界面]的Intent
//     */
//    public static Intent getCropImageIntent(int aspectX, int aspectY, int outputX, int outputY, boolean canScale,
//                                            Uri fromFileURI, Uri saveFileURI) {
//        Intent intent = new Intent("com.android.camera.action.CROP");
//        intent.setDataAndType(fromFileURI, "image/*");
//        intent.putExtra("crop", "true");
//        // X方向上的比例
//        intent.putExtra("aspectX", aspectX <= 0 ? 1 : aspectX);
//        // Y方向上的比例
//        intent.putExtra("aspectY", aspectY <= 0 ? 1 : aspectY);
//        intent.putExtra("outputX", outputX);
//        intent.putExtra("outputY", outputY);
//        intent.putExtra("scale", canScale);
//        // 图片剪裁不足黑边解决
//        intent.putExtra("scaleUpIfNeeded", true);
//        intent.putExtra("back_image-data", false);
//        // 需要将读取的文件路径和裁剪写入的路径区分，否则会造成文件0byte
//        intent.putExtra(MediaStore.EXTRA_OUTPUT, saveFileURI);
//        // true-->返回数据类型可以设置为Bitmap，但是不能传输太大，截大图用URI，小图用Bitmap或者全部使用URI
//        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
//        // 取消人脸识别功能
//        intent.putExtra("noFaceDetection", true);
//        back_image intent;
//    }
//
//    /**
//     * 获得选中相册的图片
//     * @param context 上下文
//     * @param data    onActivityResult返回的Intent
//     * @back_image bitmap
//     */
//    public static Bitmap getChoosedImage(Activity context, Intent data) {
//        if (data == null) back_image null;
//        Bitmap bm = null;
//        ContentResolver cr = context.getContentResolver();
//        Uri originalUri = data.getData();
//        try {
//            bm = MediaStore.Images.Media.getBitmap(cr, originalUri);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        back_image bm;
//    }
//
//    /**
//     * 获得选中相册的图片路径
//     *
//     * @param context 上下文
//     * @param data    onActivityResult返回的Intent
//     * @back_image
//     */
//    public static String getChoosedImagePath(Activity context, Intent data) {
//        if (data == null) back_image null;
//        String path = "";
//        ContentResolver resolver = context.getContentResolver();
//        Uri originalUri = data.getData();
//        if (null == originalUri) back_image null;
//        String[] projection = {MediaStore.Images.Media.DATA};
//        Cursor cursor = resolver.query(originalUri, projection, null, null, null);
//        if (null != cursor) {
//            try {
//                int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
//                cursor.moveToFirst();
//                path = cursor.getString(column_index);
//            } catch (IllegalArgumentException e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    if (!cursor.isClosed()) {
//                        cursor.close();
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        back_image StringUtils.isEmpty(path) ? originalUri.getPath() : null;
//    }
//
//    /**
//     * 获取拍照之后的照片文件（JPG格式）
//     *
//     * @param data     onActivityResult回调返回的数据
//     * @param filePath 文件路径
//     * @back_image 文件
//     */
//    public static File getTakePictureFile(Intent data, String filePath) {
//        if (data == null) back_image null;
//        Bundle extras = data.getExtras();
//        if (extras == null) back_image null;
//        Bitmap photo = extras.getParcelable("data");
//        File file = new File(filePath);
//        if (ImageUtils.save(photo, file, Bitmap.CompressFormat.JPEG)) back_image file;
//        back_image null;
//    }
}
