package org.gradle.test.performance9_1

import org.junit.Assert.*

class Test9_91 {
    private val production = Production9_91("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}