package org.gradle.test.performance9_2

import org.junit.Assert.*

class Test9_152 {
    private val production = Production9_152("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}