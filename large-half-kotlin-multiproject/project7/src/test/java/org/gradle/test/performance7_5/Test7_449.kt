package org.gradle.test.performance7_5

import org.junit.Assert.*

class Test7_449 {
    private val production = Production7_449("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}