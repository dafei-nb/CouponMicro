/*
package cn.cdqf.kjxzmanager.util;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

@Component
public class CodeUtil {
   @Autowired
   private IdUtils idUtils;
   @Autowired
   private Executor getCodeAsync;
    public  List<String> generateCode(Integer count,String merchantId){
        int halfcount=count/2;
        CopyOnWriteArrayList<String> objects = Lists.newCopyOnWriteArrayList();
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(() -> {
            for (int i = 0; i < halfcount; i++) {
                objects.add(idUtils.getIdNoAsync(merchantId));
            }
        }, getCodeAsync);

        CompletableFuture<Void> arrayListCompletableFuture1 = CompletableFuture.runAsync(() -> {
            for (int i = 0; i < count -halfcount; i++) {
                objects.add(idUtils.getIdNoAsync(merchantId));
            }

        },getCodeAsync);
        CompletableFuture.allOf(voidCompletableFuture, arrayListCompletableFuture1).join();
        return objects;
    }
}
*/
