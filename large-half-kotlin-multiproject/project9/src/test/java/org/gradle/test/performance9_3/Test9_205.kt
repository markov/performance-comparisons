package org.gradle.test.performance9_3

import org.junit.Assert.*

class Test9_205 {
    private val production = Production9_205("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}