package org.gradle.test.performance9_3

import org.junit.Assert.*

class Test9_257 {
    private val production = Production9_257("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}