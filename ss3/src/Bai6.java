public class Bai6 {
    public static int[] mergeBooks(int[] arrF, int[] arrS){
        int n = arrF.length;
        int m = arrS.length;
        int[] temp = new int[n+m];
        int i = 0,j=0,k=0;
        while (i<n && j<m){
            int value;
            if(arrF[i] < arrS[j]){
                value = arrF[i++];
            }else if(arrF[i] > arrS[j]){
                value = arrS[j++];
            }else {
                value = arrF[i];
                i++;
                j++;
            }
            if(k==0 || temp[k-1] != value){
                temp[k++] = value;
            }
        }
        while (i<n){
            if(k == 0 || temp[k-1] != arrF[i]){
                temp[k++] = arrF[i];
            }
            i++;
        }
        while (j<m){
            if(k==0 || temp[k-1] != arrS[j]){
                temp[k++] = arrS[j];
            }
            j++;
        }
        int[] arrayMerge = new int[k];
        for(int x = 0; x < k;x++){
            arrayMerge[x] = temp[x];
        }
        return arrayMerge;
    }
    public static void displayBooks(int[] arr){
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arrayFirst = {101,203,305,407,509};
        int[] arraySecond = {102,203,305,400,600};
        System.out.println("Danh sach kho cu: ");
        displayBooks(arrayFirst);
        System.out.println("Danh sach sach quyen gop: ");
        displayBooks(arraySecond);
        int[] arrayMerge = mergeBooks(arrayFirst,arraySecond);
        System.out.println("Danh sach thu vien sau khi gop: ");
        displayBooks(arrayMerge);
    }
}
