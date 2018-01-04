package org.gradle.test.performance9_3

import org.junit.Assert.*

class Test9_222 {
    private val production = Production9_222("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}