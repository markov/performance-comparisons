package org.gradle.test.performance9_5

import org.junit.Assert.*

class Test9_492 {
    private val production = Production9_492("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}