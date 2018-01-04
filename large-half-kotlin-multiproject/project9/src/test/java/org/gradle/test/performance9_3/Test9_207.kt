package org.gradle.test.performance9_3

import org.junit.Assert.*

class Test9_207 {
    private val production = Production9_207("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}