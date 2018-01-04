package org.gradle.test.performance9_1

import org.junit.Assert.*

class Test9_36 {
    private val production = Production9_36("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}