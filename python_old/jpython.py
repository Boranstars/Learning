def handleJavaClass(classname,*parameters):
    try:
        import jpype
        
        if not jpype.isJVMStarted():
            jpype.startJVM()
        _classname = jpype.JClass(classname)
        _classname.main([*parameters])
        
        
        
    except Exception:
        raise 
    finally: pass
        # if jpype.isJVMStarted():
        #     jpype.shutdownJVM()
    
    

handleJavaClass("HelloWorld")
handleJavaClass("MethodPractice")
