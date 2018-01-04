package org.gradle.test.performance34_3

import org.junit.Assert.*

class Test34_213 {
    private val production = Production34_213("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}