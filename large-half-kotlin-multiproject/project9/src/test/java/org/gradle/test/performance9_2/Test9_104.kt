package org.gradle.test.performance9_2

import org.junit.Assert.*

class Test9_104 {
    private val production = Production9_104("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}