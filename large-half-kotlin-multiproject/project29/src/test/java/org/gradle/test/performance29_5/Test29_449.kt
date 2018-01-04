package org.gradle.test.performance29_5

import org.junit.Assert.*

class Test29_449 {
    private val production = Production29_449("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}