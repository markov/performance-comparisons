package org.gradle.test.performance9_1

import org.junit.Assert.*

class Test9_94 {
    private val production = Production9_94("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}