package org.gradle.test.performance9_4

import org.junit.Assert.*

class Test9_391 {
    private val production = Production9_391("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}