package org.gradle.test.performance9_1

import org.junit.Assert.*

class Test9_72 {
    private val production = Production9_72("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}