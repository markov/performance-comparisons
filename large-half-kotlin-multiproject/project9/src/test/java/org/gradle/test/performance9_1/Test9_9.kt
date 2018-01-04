package org.gradle.test.performance9_1

import org.junit.Assert.*

class Test9_9 {
    private val production = Production9_9("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}