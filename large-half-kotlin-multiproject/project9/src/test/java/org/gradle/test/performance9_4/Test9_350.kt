package org.gradle.test.performance9_4

import org.junit.Assert.*

class Test9_350 {
    private val production = Production9_350("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}