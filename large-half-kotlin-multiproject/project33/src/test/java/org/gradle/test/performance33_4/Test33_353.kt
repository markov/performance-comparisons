package org.gradle.test.performance33_4

import org.junit.Assert.*

class Test33_353 {
    private val production = Production33_353("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}